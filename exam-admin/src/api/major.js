import request from '@/utils/request'

export function getMajors(data) {
  return request({
    url: '/admin/major/getmajors',
    method: 'post',
    data
  })
}

export function getMajor(data) {
  return request({
    url: '/admin/major/getmajor',
    method: 'post',
    data
  })
}

export function delMajor(data) {
    return request({
        url: '/admin/major/del',
        method: 'post',
        data
    })
}
export function updateMajor(data) {
    return request({
        url: '/admin/major/update',
        method: 'post',
        data
    })
}
export function addMajor(data) {
    return request({
        url: '/admin/major/add',
        method: 'post',
        data
    })
}