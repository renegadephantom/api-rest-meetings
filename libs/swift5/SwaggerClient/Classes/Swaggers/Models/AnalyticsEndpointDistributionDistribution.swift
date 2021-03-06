//
// AnalyticsEndpointDistributionDistribution.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct AnalyticsEndpointDistributionDistribution: Codable {

    public var google: Int?
    public var telepresence: Int?
    public var lync: Int?
    public var iOS: Int?
    public var h323: Int?
    public var interCall: Int?
    public var jabber: Int?
    public var android: Int?
    public var skype: Int?
    public var ISDN: Int?
    public var PSTN: Int?
    public var level3: Int?
    public var SIP: Int?
    public var blueJeansApp: Int?
    public var browser: Int?
    public var webRTC: Int?

    public init(google: Int?, telepresence: Int?, lync: Int?, iOS: Int?, h323: Int?, interCall: Int?, jabber: Int?, android: Int?, skype: Int?, ISDN: Int?, PSTN: Int?, level3: Int?, SIP: Int?, blueJeansApp: Int?, browser: Int?, webRTC: Int?) {
        self.google = google
        self.telepresence = telepresence
        self.lync = lync
        self.iOS = iOS
        self.h323 = h323
        self.interCall = interCall
        self.jabber = jabber
        self.android = android
        self.skype = skype
        self.ISDN = ISDN
        self.PSTN = PSTN
        self.level3 = level3
        self.SIP = SIP
        self.blueJeansApp = blueJeansApp
        self.browser = browser
        self.webRTC = webRTC
    }

    public enum CodingKeys: String, CodingKey { 
        case google = "Google"
        case telepresence = "Telepresence"
        case lync = "Lync"
        case iOS
        case h323 = "H323"
        case interCall = "InterCall"
        case jabber = "Jabber"
        case android = "Android"
        case skype = "Skype"
        case ISDN
        case PSTN
        case level3 = "Level3"
        case SIP
        case blueJeansApp = "BlueJeansApp"
        case browser = "Browser"
        case webRTC = "WebRTC"
    }


}

