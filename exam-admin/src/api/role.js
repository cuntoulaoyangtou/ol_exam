import request from '@/utils/request'

export function getRoles(data) {
  return request({
    url: '/admin/role/getroles',
    method: 'post',
    data
  })
}

export function getRole(data) {
  return request({
    url: '/admin/role/getrole',
    method: 'post',
    data
  })
}

export function delRole(data) {
    return request({
        url: '/admin/role/del',
        method: 'post',
        data
    })
}
export function updateRole(data) {
    return request({
        url: '/admin/role/update',
        method: 'post',
        data
    })
}
export function addRole(data) {
    return request({
        url: '/admin/role/add',
        method: 'post',
        data
    })
}