package org.taktik.freehealth.middleware.dto.eagreement

import java.time.Instant

class AgreementType(
    var hcpNihii: String?,
    var agreementType: String?,
    var decisionReference: String?,
    var pathologicalSituationCode: String?,
    var decisionStatus: String?,
    var decisionDate: String?,
    var responsibleIo: String?,
    var agreementStartDate: Instant?,
    var agreementEndDates: List<Instant>?
)
