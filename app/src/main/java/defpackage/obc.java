package defpackage;

import android.text.TextUtils;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class obc {
    public final oar a;
    public volatile Boolean b;
    private String c;
    private Set d;

    protected obc(oar oarVar) {
        this.a = oarVar;
    }

    public static final long b() {
        return ((Long) obh.e.f()).longValue();
    }

    public static final long c() {
        return ((Long) obh.d.f()).longValue();
    }

    public static final int d() {
        return ((Integer) obh.h.f()).intValue();
    }

    public static final int e() {
        return ((Integer) obh.g.f()).intValue();
    }

    public static final String f() {
        return (String) obh.j.f();
    }

    public static final String g() {
        return (String) obh.k.f();
    }

    public static final String h() {
        return (String) obh.i.f();
    }

    public static final boolean i() {
        return ((Boolean) obh.a.f()).booleanValue();
    }

    public final Set a() {
        String str;
        String str2 = (String) obh.s.f();
        if (this.d == null || (str = this.c) == null || !str.equals(str2)) {
            String[] strArrSplit = TextUtils.split(str2, ",");
            HashSet hashSet = new HashSet();
            for (String str3 : strArrSplit) {
                try {
                    hashSet.add(Integer.valueOf(Integer.parseInt(str3)));
                } catch (NumberFormatException unused) {
                }
            }
            this.c = str2;
            this.d = hashSet;
        }
        return this.d;
    }
}
