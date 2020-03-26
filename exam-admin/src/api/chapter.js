import request from '@/utils/request'

export function getChapters(data) {
  return request({
    url: '/admin/chapter/getchapters',
    method: 'post',
    data
  })
}

export function getChapter(data) {
  return request({
    url: '/admin/chapter/getchapter',
    method: 'post',
    data
  })
}

export function delChapter(data) {
    return request({
        url: '/admin/chapter/del',
        method: 'post',
        data
    })
}
export function updateChapter(data) {
    return request({
        url: '/admin/chapter/update',
        method: 'post',
        data
    })
}
export function addChapter(data) {
    return request({
        url: '/admin/chapter/add',
        method: 'post',
        data
    })
}

export function getChaptersAll(data) {
  return request({
      url: '/api/chapter/getchapters',
      method: 'get',
      data
  })
}