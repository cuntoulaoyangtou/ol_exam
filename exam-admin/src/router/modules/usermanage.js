import Layout from '@/layout'

const userManageRouter = {
  path: '/uesrmanage',
  component: Layout,
  redirect: 'noRedirect',
  name: '用户管理',
  meta: {
    title: '用户管理',
    icon: 'user',
    roles: ['managers','lecturer','classTeacher']
  },
  children: [
    {
      path: 'role',
      component: () => import('@/views/usermanage/role/role'),
      name: '角色管理',
      meta: { title: '角色管理', roles: ['managers'] }
    },
    {
        path: 'user',
        component: () => import('@/views/usermanage/user/user'),
        name: '用户管理',
        meta: { title: '用户管理', roles: ['managers','lecturer','classTeacher']},
    },
    {
      path: 'invitationCode',
      component: () => import('@/views/usermanage/user/invitationCode'),
      name: '邀请码',
      meta: { title: '邀请码', roles: ['managers','lecturer','classTeacher']},
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