package defpackage;

import android.hardware.camera2.params.OutputConfiguration;
import android.util.Size;
import com.google.googlex.gcam.dirtylens.PrCd.TOnSyMaYeslEl;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class wn {
    public final Size a;
    public final int b;
    public final String c;
    public final Integer d;
    public final OutputConfiguration e;
    public final qv f;
    public final qu g;
    public final qz h;
    public final qt i;
    public final qx j;
    public final qy k;
    public final List l;
    public final List m = new ArrayList();
    private final int n;

    public wn(int i, Size size, int i2, String str, Integer num, OutputConfiguration outputConfiguration, qv qvVar, qu quVar, qz qzVar, qt qtVar, qx qxVar, qy qyVar, List list) {
        this.n = i;
        this.a = size;
        this.b = i2;
        this.c = str;
        this.d = num;
        this.e = outputConfiguration;
        this.f = qvVar;
        this.g = quVar;
        this.h = qzVar;
        this.i = qtVar;
        this.j = qxVar;
        this.k = qyVar;
        this.l = list;
    }

    public final boolean a() {
        return this.f != null;
    }

    public final boolean b() {
        return this.m.size() > 1;
    }

    public final String toString() {
        return TOnSyMaYeslEl.qXZMcQsggc + this.n;
    }
}
