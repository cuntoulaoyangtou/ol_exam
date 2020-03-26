import request from '@/utils/request'

export function getCurriculums(data) {
  return request({
    url: '/admin/curriculum/getcurriculums',
    method: 'post',
    data
  })
}

export function getCurriculum(data) {
  return request({
    url: '/admin/curriculum/getcurriculum',
    method: 'post',
    data
  })
}

export function delCurriculum(data) {
    return request({
        url: '/admin/curriculum/del',
        method: 'post',
        data
    })
}
export function updateCurriculum(data) {
    return request({
        url: '/admin/curriculum/update',
        method: 'post',
        data
    })
}
export function addCurriculum(data) {
    return request({
        url: '/admin/curriculum/add',
        method: 'post',
        data
    })
}