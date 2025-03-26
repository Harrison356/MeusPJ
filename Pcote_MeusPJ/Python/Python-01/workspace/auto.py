import pyautogui as pa
import time
import pyperclip
pa.PAUSE = 1

pa.press('win')
pa.write("chrome")
pa.press('ENTER')
pa.write("youtube.com")
pa.press('ENTER')
time.sleep(6)
pa.click(x=632, y=108)
pyperclip.copy("Vinicius13")
pa.hotkey('ctrl', 'v')
pa.press('ENTER')