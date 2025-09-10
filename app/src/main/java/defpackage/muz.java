package defpackage;

import com.google.android.apps.camera.jni.gxp.Caan.yoGAhrpjU;
import com.google.android.apps.camera.jni.saliency.tLp.KsvNaXS;
import com.google.android.apps.camera.modeldownloader.uD.uCzt;
import com.google.android.gms.common.internal.oQFY.clFzVRcygwbq;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum muz {
    UNKNOWN("Unknown", 0, clFzVRcygwbq.FZtxZmwqj),
    FACE_CAM_HAL("HalFace", 999, "halface"),
    FACE("Face", 998, "/hal/face"),
    DOG_FACE("Dog Face", 979, "/fcdssd/dog"),
    CAT_FACE("Cat Face", 978, "/fcdssd/cat"),
    DOG("Dog", 879, "/m/0bt9lr"),
    CAT("Cat", 878, "/m/01yrx"),
    PET("Pet", 877, "/hotshot/pet"),
    FOOD("Food", 859, "/m/02wbm"),
    DRINK("Drink", 858, "/m/0271t"),
    BEER("Beer", 857, "/m/01599"),
    COCKTAIL("Cocktail", 856, "/m/024g6"),
    JUICE("Juice", 855, "/m/01z1kdw"),
    WINE_BOTTLE("Wine bottle", 854, "/m/020p1v"),
    BOTTLE("Bottle", 853, "/m/04dr76w"),
    WATER_BOTTLE("Water bottle", 852, "/m/0118n_9r"),
    COFFEE_CUP("Coffee cup", 851, "/m/02p5f1q"),
    TEA_CUP("Teacup", 850, "/m/03q5fj"),
    CUP("Cup", 849, KsvNaXS.NQhAeG),
    WINE_CLASS("Wine glass", 848, "/m/09tvcd"),
    MUG("Mug", 847, "/m/02jvh9"),
    TUMBLER("Tumbler", 846, "/g/120zjrld"),
    w("Pitcher", 845, "/m/054fyh"),
    JUG("Jug", 844, "/m/08hvt4"),
    BAKED_GOODS("Baked goods", 843, "/m/052lwg6"),
    BURRITO("Burrito", 842, "/m/01j3zr"),
    DESSERT(yoGAhrpjU.IXF, 841, "/m/0270h"),
    EGG("Egg", 840, "/m/033cnk"),
    C("Food dish", 839, "/m/02q08p0"),
    FRUIT("Fruit", 838, "/m/02xwb"),
    SNAKE("Snake", 837, "/m/078jl"),
    SUSHI("Sushi", 836, "/m/07030"),
    VEGETABLE("Vegetable", 835, "/m/0f4s2w"),
    BANANA("Banana", 834, "/m/09qck"),
    APPLE("Apple", 833, "/m/014j1m"),
    PEAR("Pear", 832, "/m/061_f"),
    TOMATO("Tomato", 831, "/m/07j87"),
    GRAPE("Grape", 830, "/m/0388q"),
    PINEAPPLE("Pineapple", 829, "/m/0fp6w"),
    CAKE("Cake", 828, "/m/0fszt"),
    CANDY(uCzt.WSUiOkbWs, 827, "/m/0gm28"),
    P("Salad", 826, "/m/0grw1"),
    MONITOR("Monitor", 799, "/m/02522"),
    TABLET("Tablet", 798, "/m/0bh9flk"),
    COMPUTER("Computer", 797, "com"),
    MOBILE_PHONE("Mobile phone", 796, "/m/050k8"),
    LAPTOP("Computer", 795, "/m/01c648"),
    V("Electronic group", 794, "/gca/group001"),
    CAR("Car", 749, "/m/0k4j"),
    BUS("Bus", 748, "/m/01bjv"),
    TRUCK("Truck", 747, "/m/07r04"),
    BOOKS("Document", 699, "/m/0bt_c3"),
    BUSINESS_CARD("Document", 698, "/m/01sdgj"),
    GREETING_CARD("Document", 697, "/m/03r8dh"),
    MAGAZINE("Document", 696, "/m/058sv"),
    MEDIA_COVER("Document", 695, "/j/873v0b"),
    PICTURE_FRAME("Document", 694, "/m/06z37_"),
    POSTER("Document", 693, "/m/01n5jq"),
    POST_IT_NOTE("Document", 692, "/m/02tzth"),
    ENVELOPE("Document", 691, "//m/0frqm"),
    ai("Document", 690, "/m/04gcl9"),
    DOCUMENT("Document", 689, "/m/04gcl9");

    public final String ak;
    public final String al;
    public final int am;

    muz(String str, int i, String str2) {
        this.al = str;
        this.am = i;
        this.ak = str2;
    }

    public final boolean a() {
        return this.am >= 860;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.al;
    }
}
