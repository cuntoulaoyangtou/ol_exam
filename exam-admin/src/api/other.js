import request from '@/utils/request'

export function getChapterTree() {
  return request({
    url: '/api/other/getchaptertree',
    method: 'get'
  })
}
