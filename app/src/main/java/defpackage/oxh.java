package defpackage;

import android.util.Range;
import com.bumptech.glide.qd.MyBPCgKwEjJI;
import java.util.Collection;
import java.util.LinkedList;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum oxh {
    FPS_AUTO(30, 30, 60),
    FPS_24(24, 24, 24),
    FPS_30(30, 30, 30),
    FPS_60(60, 60, 60),
    FPS_60C_24E(60, 24, 60),
    FPS_60C_30E(60, 30, 60),
    FPS_120_HFR_4X(120, 30, 120),
    FPS_240_HFR_8X(240, 30, 240),
    FPS_4_TIMELAPSE_LOW_LIGHT(4, 30, 4),
    FPS_12_TIMELAPSE_LOW_LIGHT(12, 30, 12);

    public final int k;
    public final int l;
    public final int m;

    oxh(int i, int i2, int i3) {
        this.k = i;
        this.l = i2;
        this.m = i3;
    }

    public static Collection e() {
        LinkedList linkedList = new LinkedList();
        for (oxh oxhVar : values()) {
            if (oxhVar.g()) {
                linkedList.add(oxhVar);
            }
        }
        return linkedList;
    }

    public final int a() {
        return this.k / this.l;
    }

    public final Range b() {
        Integer numValueOf = Integer.valueOf(this.k);
        return new Range(numValueOf, numValueOf);
    }

    public final boolean f() {
        return this == FPS_60C_24E || this == FPS_60C_30E;
    }

    public final boolean g() {
        return this.k > 60;
    }

    public final boolean h() {
        return this.k <= 60;
    }

    public static oxh c(int i, int i2) {
        if (i == 60) {
            if (i2 == 30) {
                return FPS_60C_30E;
            }
            if (i2 == 24) {
                return FPS_60C_24E;
            }
        } else if (i2 == 30) {
            if (i == 4) {
                return FPS_4_TIMELAPSE_LOW_LIGHT;
            }
            if (i == 12) {
                return FPS_12_TIMELAPSE_LOW_LIGHT;
            }
            if (i == 30) {
                return FPS_30;
            }
            i2 = 30;
        }
        throw new IllegalArgumentException(a.bu(i2, i, MyBPCgKwEjJI.sjLaqX, " and encoding frame rate="));
    }
}
