import request from '@/utils/request'

export function login(data) {
  return request({
    url: '/api/user/login',
    method: 'get',
    params: data
  })
}

export function getInfo(token) {
  return request({
    url: '/api/user/getuserinfo',
    method: 'get',
    params: { token }
  })
}

export function logout(token) {
  return request({
    url: '/api/user/logout',
    method: 'get',
    params: { token }
  })
}


export function getUsers(data) {
  return request({
    url: '/admin/user/getusers',
    method: 'post',
    data
  })
}

export function getUser(data) {
  return request({
    url: '/admin/user/getuser',
    method: 'post',
    data
  })
}

export function delUser(data) {
    return request({
        url: '/admin/user/del',
        method: 'post',
        data
    })
}
export function updateUser(data) {
    return request({
        url: '/admin/user/update',
        method: 'post',
        data
    })
}
export function addUser(data) {
    return request({
        url: '/admin/user/add',
        method: 'post',
        data
    })
}
