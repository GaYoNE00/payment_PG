package kim.protest.payment_pg.controller;

import com.siot.IamportRestClient.IamportClient;
import com.siot.IamportRestClient.exception.IamportResponseException;
import com.siot.IamportRestClient.response.IamportResponse;
import com.siot.IamportRestClient.response.Payment;
import kim.protest.payment_pg.dto.SalesDTO;
import kim.protest.payment_pg.repository.paymentRepository;
import kim.protest.payment_pg.service.SalesService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Locale;

@Controller
@RequestMapping("/")
@Log4j2
@Component
public class SampleController {


    private String apiKey;
    private String apisecret;


    @Autowired
    private final SalesService service;


    private IamportClient api;

    @Autowired
    private paymentRepository paymentRepository;


    @Autowired
    public SampleController(SalesService service, @Value("${myapp.api.payone_apikey}") String apikey,@Value("${myapp.api.payone_apisecret}") String apisecret){
        this.apiKey = apikey;
        this.apisecret = apisecret;

        log.info("---------------"+apiKey);
        log.info("---------------"+apisecret);

        this.api = new IamportClient(apiKey, apisecret);
        this.service = service;
    }

    //검증
    @ResponseBody
    @RequestMapping(value = "/validate/{imp_uid}", method = RequestMethod.POST)
    public IamportResponse<Payment> paymentByImpUid(
            Model model, Locale locale, HttpSession session
            , @PathVariable(value="imp_uid")String imp_uid) throws IamportResponseException, IOException{
        return api.paymentByImpUid(imp_uid);
    }


    @GetMapping({"index"})
    public void index(){
        log.info("get___In");
    }

    @GetMapping({"after"})
    public void after(){
        log.info("pay_complate");
    }
    


    @ResponseBody
    @RequestMapping(value = "/db", method = RequestMethod.POST)
    public Long db(@RequestBody SalesDTO dto) {
        log.info("주어진 데이터 정보------------------"+dto);

        Long gno = service.register(dto);
        return gno;
    }

    @GetMapping({"fail"})
    public void fail(){
        log.info("pay_fail");
    }

}
