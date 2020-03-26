import request from '@/utils/request'

export function getGrades(data) {
  return request({
    url: '/admin/grade/getgrades',
    method: 'post',
    data
  })
}

export function getGrade(data) {
  return request({
    url: '/admin/grade/getgrade',
    method: 'post',
    data
  })
}

export function delGrade(data) {
    return request({
        url: '/admin/grade/del',
        method: 'post',
        data
    })
}
export function updateGrade(data) {
    return request({
        url: '/admin/grade/update',
        method: 'post',
        data
    })
}
export function addGrade(data) {
    return request({
        url: '/admin/grade/add',
        method: 'post',
        data
    })
}