package org.taktik.freehealth.middleware.dto.eagreement

class ConsultListOfAgreementResponse(
    var patientSsin: String?,
    var patientIo: String?,
    var patientIoMembership: String?,
    var rejectedReason: List<String>?,
    var agreementList: List<AgreementType>?
)
