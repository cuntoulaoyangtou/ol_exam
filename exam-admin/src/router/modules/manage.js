import Layout from '@/layout'

const manageRouter = {
  path: '/manage',
  component: Layout,
  redirect: 'noRedirect',
  name: '基本管理',
  meta: {
    title: '基本管理',
    icon: 'component',
    roles: ['managers'] 
  },
  children: [
    {
      path: 'shool',
      component: () => import('@/views/manage/shool/shool'),
      name: '学校管理',
      meta: { title: '学校管理' }
    },
    {
      path: 'grade',
      component: () => import('@/views/manage/grade/grade'),
      name: '年级管理',
      meta: { title: '年级管理' }
    },
    {
      path: 'major',
      component: () => import('@/views/manage/major/major'),
      name: '专业管理',
      meta: { title: '专业管理' }
    },
    {
      path: 'clazz',
      component: () => import('@/views/manage/clazz/clazz'),
      name: '班级管理',
      meta: { title: '班级管理' }
    },
    {
      path: 'curriculum',
      component: () => import('@/views/manage/curriculum/curriculum'),
      name: '课程管理',
      meta: { title: '课程管理' }
    },
    {
      path: 'chapter',
      component: () => import('@/views/manage/chapter/chapter'),
      name: '章节管理',
      meta: { title: '章节管理' }
    },
    
  ]
}

export default manageRouter