//
// EndpointIndigo.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct EndpointIndigo: Codable {

    public var _id: Int?
    public var callguid: String?
    public var name: String?
    public var endpoint: String?
    public var vendor: String?
    public var version: String?
    public var uniqId: String?
    public var remoteAddress: String?
    public var leader: Bool?
    public var secureCall: Bool?
    public var natDetected: Bool?
    public var proxy: Bool?
    public var roiDistance: Float?
    public var mpls: Bool?
    public var videoShare: Bool?
    public var recording: Bool?
    public var creationTime: Int64?
    public var meetingJoinTime: Int64?
    public var meetingLeaveTime: Int64?
    public var didNumber: String?
    public var location: EndpointIndigoLocation?
    public var summaryStats: EndpointIndigoSummaryStats?
    public var endpointAttributes1: EndpointIndigoEndpointAttributes1?
    public var traceroute: EndpointIndigoTraceroute?
    public var mhtaskStopped: Bool?

    public init(_id: Int?, callguid: String?, name: String?, endpoint: String?, vendor: String?, version: String?, uniqId: String?, remoteAddress: String?, leader: Bool?, secureCall: Bool?, natDetected: Bool?, proxy: Bool?, roiDistance: Float?, mpls: Bool?, videoShare: Bool?, recording: Bool?, creationTime: Int64?, meetingJoinTime: Int64?, meetingLeaveTime: Int64?, didNumber: String?, location: EndpointIndigoLocation?, summaryStats: EndpointIndigoSummaryStats?, endpointAttributes1: EndpointIndigoEndpointAttributes1?, traceroute: EndpointIndigoTraceroute?, mhtaskStopped: Bool?) {
        self._id = _id
        self.callguid = callguid
        self.name = name
        self.endpoint = endpoint
        self.vendor = vendor
        self.version = version
        self.uniqId = uniqId
        self.remoteAddress = remoteAddress
        self.leader = leader
        self.secureCall = secureCall
        self.natDetected = natDetected
        self.proxy = proxy
        self.roiDistance = roiDistance
        self.mpls = mpls
        self.videoShare = videoShare
        self.recording = recording
        self.creationTime = creationTime
        self.meetingJoinTime = meetingJoinTime
        self.meetingLeaveTime = meetingLeaveTime
        self.didNumber = didNumber
        self.location = location
        self.summaryStats = summaryStats
        self.endpointAttributes1 = endpointAttributes1
        self.traceroute = traceroute
        self.mhtaskStopped = mhtaskStopped
    }

    public enum CodingKeys: String, CodingKey { 
        case _id = "id"
        case callguid
        case name
        case endpoint
        case vendor
        case version
        case uniqId
        case remoteAddress
        case leader
        case secureCall
        case natDetected
        case proxy
        case roiDistance
        case mpls
        case videoShare
        case recording
        case creationTime
        case meetingJoinTime
        case meetingLeaveTime
        case didNumber
        case location
        case summaryStats
        case endpointAttributes1
        case traceroute
        case mhtaskStopped
    }


}
