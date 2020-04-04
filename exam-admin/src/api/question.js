import request from '@/utils/request'

export function getQuestions(data) {
  return request({
    url: '/admin/question/getquestions',
    method: 'post',
    data
  })
}
export function addQuestion(data) {
  return request({
    url: '/admin/question/add',
    method: 'post',
    data
  })
}
export function updateQuestion(data) {
  return request({
    url: '/admin/question/update',
    method: 'post',
    data
  })
}

export function delQuestion(data) {
  return request({
    url: '/admin/question/del',
    method: 'post',
    data
  })
}