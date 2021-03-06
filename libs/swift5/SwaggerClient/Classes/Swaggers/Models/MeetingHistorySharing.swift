//
// MeetingHistorySharing.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct MeetingHistorySharing: Codable {

    public enum RecepientType: String, Codable { 
        case enterprise = "ENTERPRISE"
        case _public = "PUBLIC"
    }
    public enum Status: String, Codable { 
        case active = "ACTIVE"
    }
    public var _id: Int?
    public var meetingGuid: String?
    /** Numeric user ID for the meeting owner. */
    public var ownerId: Int?
    public var sharingUrl: String?
    public var recepientType: RecepientType?
    public var properties: String?
    public var status: Status?
    public var downloadable: Bool?
    public var passcode: String?
    public var validity: String?
    /** A [UNIX Timestamp](https://currentmillis.com/) in milliseconds */
    public var created: Int64?
    /** A [UNIX Timestamp](https://currentmillis.com/) in milliseconds */
    public var lastmodified: Int64?

    public init(_id: Int?, meetingGuid: String?, ownerId: Int?, sharingUrl: String?, recepientType: RecepientType?, properties: String?, status: Status?, downloadable: Bool?, passcode: String?, validity: String?, created: Int64?, lastmodified: Int64?) {
        self._id = _id
        self.meetingGuid = meetingGuid
        self.ownerId = ownerId
        self.sharingUrl = sharingUrl
        self.recepientType = recepientType
        self.properties = properties
        self.status = status
        self.downloadable = downloadable
        self.passcode = passcode
        self.validity = validity
        self.created = created
        self.lastmodified = lastmodified
    }

    public enum CodingKeys: String, CodingKey { 
        case _id = "id"
        case meetingGuid
        case ownerId
        case sharingUrl
        case recepientType
        case properties
        case status
        case downloadable
        case passcode
        case validity
        case created
        case lastmodified
    }


}

