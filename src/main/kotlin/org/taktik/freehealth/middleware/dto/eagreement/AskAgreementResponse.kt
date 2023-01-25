package org.taktik.freehealth.middleware.dto.eagreement

import java.time.Instant

class AskAgreementResponse(
    var hcpNihii: String,
    var patientSsin: String?,
    var patientIo: String?,
    var patientIoMembership: String?,
    var rejectedReasons: List<String>?,
    var agreementType: String?,
    var decisionReference: String?,
    var pathologicalSituationCode: String?,
    var decisionStatus: String?,
    var decisionDate: String?,
    var responsibleIo: String?,
    var agreementStartDate: Instant?,
    var agreementEndDates: List<Instant>?,
    var refusalReasons: List<String>?
)
