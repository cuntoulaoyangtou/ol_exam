import request from '@/utils/request'

export function getShools(data) {
  return request({
    url: '/admin/shool/getshools',
    method: 'post',
    data
  })
}

export function getShool(data) {
  return request({
    url: '/admin/shool/getshool',
    method: 'post',
    data
  })
}

export function delShool(data) {
    return request({
        url: '/admin/shool/del',
        method: 'post',
        data
    })
}
export function updateShool(data) {
    return request({
        url: '/admin/shool/update',
        method: 'post',
        data
    })
}
export function addShool(data) {
    return request({
        url: '/admin/shool/add',
        method: 'post',
        data
    })
}