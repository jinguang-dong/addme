package defpackage;

import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class odb {
    private static volatile odb c;
    public int a;
    public final Object b;

    public odb(String str) {
        this.a = 0;
        this.b = str;
    }

    public static odb b() {
        if (c == null) {
            synchronized (odb.class) {
                if (c == null) {
                    c = new odb();
                }
            }
        }
        return c;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    final synchronized ocr a() {
        ArrayList arrayList;
        ?? r0 = this.b;
        arrayList = new ArrayList(r0.values());
        int i = this.a;
        if (i > 0) {
            arrayList.add(new odc("UNKNOWN", 1002, i));
            this.a = 0;
        }
        r0.clear();
        return new ocr(arrayList);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final synchronized void c(odc odcVar) {
        cni cniVar = new cni(odcVar.a, Integer.valueOf(odcVar.b));
        ?? r1 = this.b;
        odc odcVar2 = (odc) r1.get(cniVar);
        if (odcVar2 != null) {
            odcVar2.c = ske.as(odcVar2.c, odcVar.c);
        } else if (((aaa) r1).d >= 100) {
            this.a = ske.as(this.a, odcVar.c);
        } else {
            r1.put(cniVar, odcVar);
        }
    }

    public final char d() {
        String str = (String) this.b;
        int length = str.length();
        int i = this.a;
        if (i < length) {
            return str.charAt(i);
        }
        return (char) 0;
    }

    public final char e(int i) {
        String str = (String) this.b;
        if (i < str.length()) {
            return str.charAt(i);
        }
        return (char) 0;
    }

    public final int f(String str, int i) {
        char cE = e(this.a);
        int i2 = 0;
        boolean z = false;
        while (cE >= '0' && cE <= '9') {
            int i3 = this.a + 1;
            this.a = i3;
            i2 = (i2 * 10) + (cE - '0');
            cE = e(i3);
            z = true;
        }
        if (!z) {
            throw new edv(str, 5);
        }
        if (i2 > i) {
            return i;
        }
        if (i2 < 0) {
            return 0;
        }
        return i2;
    }

    public final int g() {
        return ((String) this.b).length();
    }

    public final void h() {
        this.a++;
    }

    public final boolean i() {
        return this.a < ((String) this.b).length();
    }

    public odb(owf owfVar) {
        this.b = owfVar;
    }

    private odb() {
        this.a = 0;
        this.b = new yd();
    }

    public odb(byte[] bArr) {
        this.b = new ReentrantLock();
    }
}
