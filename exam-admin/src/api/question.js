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