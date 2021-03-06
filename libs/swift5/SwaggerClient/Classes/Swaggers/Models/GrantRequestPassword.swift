//
// GrantRequestPassword.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct GrantRequestPassword: Codable {

    public enum GrantType: String, Codable { 
        case password = "password"
    }
    /** The type of access token you are requesting. */
    public var grantType: GrantType?
    /** Your user name that you use to login to our site. */
    public var username: String?
    /** Your user password that you use to login to our site. */
    public var password: String?

    public init(grantType: GrantType?, username: String?, password: String?) {
        self.grantType = grantType
        self.username = username
        self.password = password
    }

    public enum CodingKeys: String, CodingKey { 
        case grantType = "grant_type"
        case username
        case password
    }


}

