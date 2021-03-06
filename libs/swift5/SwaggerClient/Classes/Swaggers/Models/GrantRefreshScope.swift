//
// GrantRefreshScope.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct GrantRefreshScope: Codable {

    /** The ID of your user. */
    public var user: Int?
    public var appPermissions: [GrantCodeScopeAppPermissions]?
    /** The name of the partition you are on. */
    public var partitionName: String?
    public var partition: Partition?
    /** Comma-delimited list of scopes authorized by this token. */
    public var bearerPermissions: String?

    public init(user: Int?, appPermissions: [GrantCodeScopeAppPermissions]?, partitionName: String?, partition: Partition?, bearerPermissions: String?) {
        self.user = user
        self.appPermissions = appPermissions
        self.partitionName = partitionName
        self.partition = partition
        self.bearerPermissions = bearerPermissions
    }


}

