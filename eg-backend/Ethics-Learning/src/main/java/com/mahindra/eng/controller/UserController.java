package com.mahindra.eng.controller;

import com.mahindra.eng.infrastructure.entity.*;
import com.mahindra.eng.model.MaterialDTO;
import com.mahindra.eng.model.UserDTO;
import com.mahindra.eng.service.impl.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final CodeOfViolationServiceImpl codeOfViolationServiceImpl;
    private final CountryServiceImpl countryServiceImpl;
    private final EthicsPolicyServiceImpl ethicsPolicyServiceImpl;
    private final LocationServiceImpl locationServiceImpl;
    private final EthicsCounselorImpl ethicsCounselorImpl;
    @Autowired
    private final UserModuleImpl userModuleimpl;
    private final MaterialServiceImpl materialServiceImpl;
    private final UserServiceImpl userServiceImpl;



    @Autowired
    public UserController(CodeOfViolationServiceImpl codeOfViolationServiceImpl, CountryServiceImpl countryServiceImpl, EthicsPolicyServiceImpl ethicsPolicyServiceImpl,LocationServiceImpl locationServiceImpl,EthicsCounselorImpl ethicsCounselorImpl, UserModuleImpl userModuleimpl, MaterialServiceImpl materialServiceImpl, UserServiceImpl userServiceImpl) {
        this.codeOfViolationServiceImpl = codeOfViolationServiceImpl;
        this.countryServiceImpl = countryServiceImpl;
        this.ethicsPolicyServiceImpl = ethicsPolicyServiceImpl;
        this.locationServiceImpl = locationServiceImpl;
        this.ethicsCounselorImpl = ethicsCounselorImpl;
        this.userModuleimpl = userModuleimpl;
        this.materialServiceImpl = materialServiceImpl;
        this.userServiceImpl = userServiceImpl;
    }

   // Prabeer - Done
    @PostMapping("/getHomePageData")
    public List<User> getHomePageData(@RequestParam Long userId, @RequestParam int companyId) {
        return userServiceImpl.getHomePageData(userId,companyId);
    }

    // Prabeer
//    @PostMapping("/getMaterialRecords")
//    public Material getMaterialRecords(@RequestParam Long id, @RequestParam int companyId, @RequestParam String moduleName, @RequestParam int offset, @RequestParam int limit, @RequestParam String searchParameter) {
//
//        return null;
//    }


    // Prabeer - Done
    @PostMapping("/getMaterialRecords")
    public List<Material> getMaterialRecords(@RequestParam String moduleName, @RequestParam int offset, @RequestParam int limit) {

        return materialServiceImpl.findByModuleType(moduleName,limit);
    }


    // Prashant - Done
    @PostMapping("/getCodeViolations")
    public List<CodeOfViolation> getCodeViolations(@RequestParam int companyId) {
        return codeOfViolationServiceImpl.getCodeOfViolationList(companyId);
    }

    // Prashant - Done
    @PostMapping("/getEthicsPolicy")
    public List<EthicsPolicy> getEthicsPolicy(@RequestParam Long companyId) {
        return ethicsPolicyServiceImpl.getEthicsPolicyList(companyId);
    }

    // Prashant - Done
    @PostMapping("/getEthicsPolicyDetails")
    public EthicsPolicy getEthicsPolicyDetails(@RequestParam Long ethicsPolicyId) {
        return ethicsPolicyServiceImpl.getEthicsPolicyById(ethicsPolicyId);
    }

//  Prabeer - done
    @PostMapping("/getUserProfile")
    public List<UserModule> getUserProfile(@RequestParam Long userId) {

        return userModuleimpl.getUserProfile(userId);
    }


    //Prabeer - Done
    @PostMapping("/getHelpDetails")
    public User getHelpDetails(@RequestParam int companyId) {

        return userServiceImpl.getHelpDetails(companyId);
    }




    // Prashant - Done
    @GetMapping("/getCountryList")
    public List<Country> getCountryList() {
        return countryServiceImpl.getCountryList();
    }

    // Prashant - Done
    @PostMapping("/getCountryCounselorDetails")
    public UserDTO getCountryCounselorDetails(@RequestParam int companyId, @RequestParam int countryId) {
        return null;
    }

    // Prashant - Done
    @GetMapping("/getLocationList")
    public List<Location> getLocationList(@RequestParam Long companyId) {
        return locationServiceImpl.getLocationList(companyId);
    }

    // Prashant - Done
    @PostMapping("/getLocationCounselorDetails")
    public List<EthicsCounselor> getLocationCounselorDetails(@RequestParam Long locationId) {
        return ethicsCounselorImpl.getEthicsCounselorListById(locationId);
    }

    // Prashant - Done
    @PostMapping("/getAllCounselorDetails")
    public List<EthicsCounselor> getAllCounselorDetails(@RequestParam Long companyId) {
        return ethicsCounselorImpl.getEthicsCounselorListByCompanyId(companyId);
    }
}
