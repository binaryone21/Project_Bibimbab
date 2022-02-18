/*** Global Variable **************************************************/





/*** Event ************************************************************/





/*** Function *********************************************************/

    /* 파라미터 값을 가져오는 함수 */
    function getParameterByName(name, url=window.location.href) {
        name = name.replace(/[\[\]]/g, '\\$&')
        let regex = new RegExp('[?&]' + name + '(=([^&#]*)|&|#|$)')
        let results = regex.exec(url)

        if (!results) return null
        if (!results[2]) return ''

        return decodeURIComponent(results[2].replace(/\+/g, ' '));
    }