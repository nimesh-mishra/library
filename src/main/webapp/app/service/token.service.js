"use strict";
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};
var http_client_1 = require("../config/http.client");
var core_1 = require("angular2/core");
var local_storage_1 = require("./local-storage");
var http_1 = require("angular2/http");
var TokenService = (function () {
    function TokenService(_httpClient, _localStorageService, _http) {
        this._httpClient = _httpClient;
        this._localStorageService = _localStorageService;
        this._http = _http;
        this.ACCESS_TOKEN_REFRESH_URL = "http://localhost:8080/library/api/auth/refresh";
    }
    TokenService = __decorate([
        core_1.Injectable(), 
        __metadata('design:paramtypes', [http_client_1.HttpClient, local_storage_1.LocalStorgeService, http_1.Http])
    ], TokenService);
    return TokenService;
}());
exports.TokenService = TokenService;
//# sourceMappingURL=token.service.js.map