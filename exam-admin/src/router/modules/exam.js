import Layout from '@/layout'

const examRouter = {
  path: '/topic',
  component: Layout,
  redirect: 'noRedirect',
  name: '试题管理',
  meta: {
    title: '试题管理',
    icon: 'user'
  },
  children: [
    {
      path: 'index',
      component: () => import('@/views/topic/index'),
      name: '所有试题',
      meta: { title: '所有试题' }
    }
    // {
    //     path: 'user',
    //     component: () => import('@/views/usermanage/user/user'),
    //     name: '用户管理',
    //     meta: { title: '用户管理' },
    // },
  ]
}

export default examRouter