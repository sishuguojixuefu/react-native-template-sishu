import React from 'react'
import { NavigationNativeContainer } from '@react-navigation/native'
import { createStackNavigator } from '@react-navigation/stack'
import WelcomeScreen from '../screens/WelcomeScreen'

export type RootStackParamList = {
  WelcomeScreen: undefined
}

const RootStack = createStackNavigator<RootStackParamList>()

export default () => {
  return (
    <NavigationNativeContainer>
      <RootStack.Navigator>
        <RootStack.Screen name="WelcomeScreen" component={WelcomeScreen} options={{ headerShown: false }} />
      </RootStack.Navigator>
    </NavigationNativeContainer>
  )
}
