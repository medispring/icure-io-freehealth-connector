package be.ehealth.businessconnector.chapterIV.service;

import be.ehealth.businessconnector.chapterIV.exception.ChapterIVBusinessConnectorException;
import be.ehealth.technicalconnector.exception.SessionManagementException;
import be.ehealth.technicalconnector.exception.TechnicalConnectorException;
import be.ehealth.technicalconnector.service.sts.security.SAMLToken;
import be.fgov.ehealth.chap4.protocol.v1.AskChap4MedicalAdvisorAgreementRequest;
import be.fgov.ehealth.chap4.protocol.v1.AskChap4MedicalAdvisorAgreementResponse;
import be.fgov.ehealth.chap4.protocol.v1.ConsultChap4MedicalAdvisorAgreementRequest;
import be.fgov.ehealth.chap4.protocol.v1.ConsultChap4MedicalAdvisorAgreementResponse;

public interface ChapterIVService {
   ConsultChap4MedicalAdvisorAgreementResponse consultChap4MedicalAdvisorAgreement(SAMLToken var1, ConsultChap4MedicalAdvisorAgreementRequest var2) throws ChapterIVBusinessConnectorException, TechnicalConnectorException, SessionManagementException;

   AskChap4MedicalAdvisorAgreementResponse askChap4MedicalAdvisorAgreement(SAMLToken var1, AskChap4MedicalAdvisorAgreementRequest var2) throws ChapterIVBusinessConnectorException, TechnicalConnectorException, SessionManagementException;
}