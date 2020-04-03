import request from '@/utils/request'

export function preTest() {
    return request({
      url: '/admin/test/pretest',
      method: 'post',
    })
  }

export function getTests(data) {
  return request({
    url: '/admin/test/gettests',
    method: 'post',
    data
  })
}
export function addTest(data) {
  return request({
    url: '/admin/test/add',
    method: 'post',
    data
  })
}
export function updateTest(data) {
  return request({
    url: '/admin/test/update',
    method: 'post',
    data
  })
}

export function delTest(data) {
  return request({
    url: '/admin/test/del',
    method: 'post',
    data
  })
}