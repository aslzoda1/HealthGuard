import java.util.*
import kotlin.concurrent.timer

fun main() {
    val scanner = Scanner(System.`in`)

    println("🌿 HealthGuard: Sizning raqamli salomatlik yordamchingiz!")
    println("-----------------------------------------------------")

    print("⏲️ Har necha daqiqada eslatma beray? (masalan, 20): ")
    val intervalMinutes = scanner.nextLong()

    val intervalMillis = intervalMinutes * 60 * 1000

    println("🚀 Tizim ishga tushdi! Men orqa fonda ishlayman.")
    println("Siz bemalol kodingizni yozishingiz mumkin. Men vaqti kelganda xabar beraman.")

    timer(initialDelay = intervalMillis, period = intervalMillis) {
        println("\n\n🔔 [ESLATMA] 🔔")

        val randomTip = when ((1..3).random()) {
            1 -> "💧 Suv ichish vaqti keldi! Bir qultum suv tanangizga quvvat bag'ishlaydi."
            2 -> "👀 Ko'zlaringizga dam bering! 20 metr uzoqlikka 20 soniya davomida qarang."
            3 -> "🧘 Biroz kerishib oling! Orqa miya va bo'yin mushaklarini bo'shashtiring."
            else -> "🚶 Biroz yurib keling!"
        }

        println(randomTip)
        println("♻️ Keyingi eslatma yana $intervalMinutes daqiqadan so'ng.")
        print("\nIshingizda davom eting (yoki to'xtatish uchun 'exit' deb yozing): ")
    }

    while (true) {
        if (scanner.next().lowercase() == "exit") {
            println("Salomatligingizga befarq bo'lmaganingiz uchun rahmat! Xayr! 😊")
            System.exit(0)
        }
    }
}