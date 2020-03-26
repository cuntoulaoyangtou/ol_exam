import request from '@/utils/request'

export function getClazzs(data) {
  return request({
    url: '/admin/clazz/getclazzs',
    method: 'post',
    data
  })
}

export function getClazz(data) {
  return request({
    url: '/admin/clazz/getclazz',
    method: 'post',
    data
  })
}

export function delClazz(data) {
    return request({
        url: '/admin/clazz/del',
        method: 'post',
        data
    })
}
export function updateClazz(data) {
    return request({
        url: '/admin/clazz/update',
        method: 'post',
        data
    })
}
export function addClazz(data) {
    return request({
        url: '/admin/clazz/add',
        method: 'post',
        data
    })
}