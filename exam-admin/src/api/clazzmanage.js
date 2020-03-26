import request from '@/utils/request'

export function getClazzmanages(data) {
  return request({
    url: '/admin/clazzmanage/getclazzmanages',
    method: 'post',
    data
  })
}

export function getClazzmanage(data) {
  return request({
    url: '/admin/clazzmanage/getclazzmanage',
    method: 'post',
    data
  })
}

export function delClazzmanage(data) {
    return request({
        url: '/admin/clazzmanage/del',
        method: 'post',
        data
    })
}
export function updateClazzmanage(data) {
    return request({
        url: '/admin/clazzmanage/update',
        method: 'post',
        data
    })
}
export function addClazzmanage(data) {
    return request({
        url: '/admin/clazzmanage/add',
        method: 'post',
        data
    })
}
export function addClazzmanages(data) {
  return request({
      url: '/admin/clazzmanage/adds',
      method: 'post',
      data
  })
}