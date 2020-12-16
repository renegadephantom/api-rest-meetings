//
// PersonalMeetingRoomAdvancedMeetingOptionsEditability.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct PersonalMeetingRoomAdvancedMeetingOptionsEditability: Codable {

    /** Allow UI to edit AutoRecord field */
    public var autoRecord: Bool?
    /** Allow UI to edit this field */
    public var enforceMeetingEncryption: Bool?
    /** Allow UI to edict videoBestFit field */
    public var videoBestFit: Bool?
    /** Allow UI to edit this field */
    public var enforceMeetingEncryptionAllowPSTN: Bool?
    /** Allow UI to edit the disallowChat field */
    public var disallowChat: Bool?
    /** Allow UI to edit muteParticipantsOnEntry field */
    public var muteParticipantsOnEntry: Bool?
    /** Allow UI to edit moderatorLess field */
    public var moderatorLess: Bool?
    /** Allow UI to edit this field */
    public var showAllAttendeesInMeetingInvite: Bool?

    public init(autoRecord: Bool?, enforceMeetingEncryption: Bool?, videoBestFit: Bool?, enforceMeetingEncryptionAllowPSTN: Bool?, disallowChat: Bool?, muteParticipantsOnEntry: Bool?, moderatorLess: Bool?, showAllAttendeesInMeetingInvite: Bool?) {
        self.autoRecord = autoRecord
        self.enforceMeetingEncryption = enforceMeetingEncryption
        self.videoBestFit = videoBestFit
        self.enforceMeetingEncryptionAllowPSTN = enforceMeetingEncryptionAllowPSTN
        self.disallowChat = disallowChat
        self.muteParticipantsOnEntry = muteParticipantsOnEntry
        self.moderatorLess = moderatorLess
        self.showAllAttendeesInMeetingInvite = showAllAttendeesInMeetingInvite
    }


}

