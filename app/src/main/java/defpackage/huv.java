package defpackage;

import com.google.ar.core.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class huv {
    public static final huv a;
    public static final huv b;
    public static final huv c;
    public static final huv d;
    private static final /* synthetic */ huv[] i;
    public final int e;
    public final int f;
    public final int g;
    public final int h;

    static {
        huv huvVar = new huv("RIGHT", 0, 3, R.string.serengeti_right, R.drawable.gs_arrow_right_alt_vd_theme_24, R.string.serengeti_accessibility_direction_left_right);
        a = huvVar;
        huv huvVar2 = new huv("LEFT", 1, 4, R.string.serengeti_left, R.drawable.gs_arrow_left_alt_vd_theme_24, R.string.serengeti_accessibility_direction_right_left);
        b = huvVar2;
        huv huvVar3 = new huv("UP", 2, 5, R.string.serengeti_up, R.drawable.gs_arrow_upward_vd_theme_24, R.string.serengeti_accessibility_direction_down_up);
        c = huvVar3;
        huv huvVar4 = new huv("DOWN", 3, 6, R.string.serengeti_down, R.drawable.gs_arrow_downward_vd_theme_24, R.string.serengeti_accessibility_direction_up_down);
        d = huvVar4;
        huv[] huvVarArr = {huvVar, huvVar2, huvVar3, huvVar4};
        i = huvVarArr;
        ske.aB(huvVarArr);
    }

    private huv(String str, int i2, int i3, int i4, int i5, int i6) {
        this.h = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
    }

    public static huv[] values() {
        return (huv[]) i.clone();
    }
}
