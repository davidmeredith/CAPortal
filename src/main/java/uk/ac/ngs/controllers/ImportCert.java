/*
 * Copyright (C) 2015 STFC
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package uk.ac.ngs.controllers;

import java.util.Locale;
import javax.inject.Inject;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
//import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uk.ac.ngs.dao.JdbcRequestDao;
import uk.ac.ngs.security.SecurityContextService;

/**
 *
 * @author jza23618
 */
@Controller
@RequestMapping("/caop/importcert")
public class ImportCert {
    private static final Log log = LogFactory.getLog(ImportCert.class);
    private JdbcRequestDao jdbcRequestDao;
    private SecurityContextService securityContextService;
    
    public ImportCert() {
    }
    
    @ModelAttribute
    public void populateModel(Model model) {
        log.debug("caop import populate model"); 
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public String raAdminHome(Locale locale, Model model) {
        log.debug("Controller /caop/exportcert");
        return "caop/importcert";
    }
    
    @Inject
    public void setSecurityContextService(SecurityContextService securityContextService) {
        this.securityContextService = securityContextService;
    }
    
    @Inject
    public void setJdbcRequestDao(JdbcRequestDao jdbcRequestDao) {
        this.jdbcRequestDao = jdbcRequestDao;
    }
}
