import Layout from '@/layout'

const userManageRouter = {
  path: '/uesrmanage',
  component: Layout,
  redirect: 'noRedirect',
  name: '用户管理',
  meta: {
    title: '用户管理',
    icon: 'user'
  },
  children: [
    {
      path: 'role',
      component: () => import('@/views/usermanage/role/role'),
      name: '角色管理',
      meta: { title: '角色管理' }
    },
    {
        path: 'user',
        component: () => import('@/views/usermanage/user/user'),
        name: '用户管理',
        meta: { title: '用户管理' },
    },
    {
        path: 'clazzmanage',
        component: () => import('@/views/usermanage/clazzmanage/clazzmanage'),
        name: '班级管理员',
        meta: { title: '班级管理员', roles: ['managers']},
    }
  ]
}

export default userManageRouter