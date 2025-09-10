package defpackage;

import android.content.Context;
import java.util.ArrayDeque;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ode {
    private static volatile ode d;
    public int a;
    public final Object b;
    public final Object c;

    public ode(esj esjVar) {
        this.c = fbe.a(150, new esi(this, 1));
        this.b = esjVar;
    }

    public static ode c(Context context) {
        if (d == null) {
            synchronized (ode.class) {
                if (d == null) {
                    d = new ode(context);
                }
            }
        }
        return d;
    }

    public static final float g(float f) {
        double dSignum = Math.signum(f);
        float fAbs = Math.abs(f);
        return (float) (dSignum * Math.sqrt(fAbs + fAbs));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Queue] */
    final synchronized odd a() {
        return (odd) this.c.peek();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Queue] */
    public final synchronized odd b() {
        ?? r0 = this.c;
        odd oddVar = (odd) r0.peek();
        if (oddVar != null) {
            int i = oddVar.c + 1;
            oddVar.c = i;
            if (i >= uav.a.fr().b((Context) this.b)) {
                return (odd) r0.poll();
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Queue] */
    final synchronized boolean d(ocm ocmVar) {
        byte[] bArr = ocmVar.b;
        bArr.getClass();
        int length = bArr.length;
        ?? r1 = this.c;
        long size = r1.size();
        uav uavVar = uav.a;
        uaw uawVarFr = uavVar.fr();
        Object obj = this.b;
        if (size < uawVarFr.c((Context) obj)) {
            if (this.a + length < uavVar.fr().a((Context) obj)) {
                this.a += length;
                r1.add(new odd(ocmVar));
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Queue] */
    final synchronized void e() {
        odd oddVar = (odd) this.c.poll();
        if (oddVar != null) {
            byte[] bArr = oddVar.a.b;
            bArr.getClass();
            this.a -= bArr.length;
        }
    }

    public final void f(long j, float f) {
        int i = (this.a + 1) % 20;
        this.a = i;
        ((long[]) this.b)[i] = j;
        ((float[]) this.c)[i] = f;
    }

    public ode() {
        long[] jArr = new long[20];
        this.b = jArr;
        this.c = new float[20];
        this.a = 0;
        Arrays.fill(jArr, Long.MIN_VALUE);
    }

    private ode(Context context) {
        this.a = 0;
        this.c = new ArrayDeque();
        this.b = context;
    }
}
