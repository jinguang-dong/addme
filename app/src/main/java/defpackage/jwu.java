package defpackage;

import android.opengl.GLES20;
import java.util.Vector;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class jwu implements Runnable {
    final /* synthetic */ szh a;
    final /* synthetic */ jxa b;

    public jwu(jxa jxaVar, szh szhVar) {
        this.a = szhVar;
        this.b = jxaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Vector vector;
        jxa jxaVar = this.b;
        jej jejVar = jxaVar.r;
        if (jejVar != null) {
            jejVar.m = false;
            jeo jeoVar = jejVar.c;
            if (jeoVar != null) {
                int i = 0;
                while (true) {
                    vector = jeoVar.j;
                    if (i >= vector.size()) {
                        break;
                    }
                    ood oodVar = ((jen) vector.get(i)).i;
                    if (oodVar != null) {
                        oodVar.c();
                    }
                    ood oodVar2 = ((jen) vector.get(i)).j;
                    if (oodVar2 != null) {
                        oodVar2.c();
                    }
                    i++;
                }
                vector.clear();
                jeoVar.i.b();
            }
            GLES20.glDeleteTextures(2, new int[]{jejVar.p, jejVar.o}, 0);
            jem jemVar = jejVar.b;
            Vector vector2 = jemVar.d;
            ood oodVar3 = !vector2.isEmpty() ? (ood) vector2.get(0) : null;
            if (oodVar3 != null) {
                oodVar3.c();
            }
            jdt jdtVar = jejVar.H;
            if (jdtVar != null) {
                jdtVar.d();
            }
            jdt jdtVar2 = jejVar.I;
            if (jdtVar2 != null) {
                jdtVar2.d();
            }
            jff jffVar = jejVar.i;
            if (jffVar != null) {
                jffVar.d();
            }
            jdu jduVar = jejVar.j;
            if (jduVar != null) {
                jduVar.d();
            }
            jfd jfdVar = jejVar.k;
            if (jfdVar != null) {
                jfdVar.d();
            }
            jdr jdrVar = jejVar.a;
            if (jdrVar != null) {
                ((jek) jdrVar).f.d();
            }
            jeq jeqVar = jejVar.h;
            if (jeqVar != null) {
                for (int i2 = 0; i2 < jeqVar.a.size(); i2++) {
                    if (jeqVar.a.get(i2) != null) {
                        ((jdv) jeqVar.a.get(i2)).e();
                    }
                }
                jfd jfdVar2 = jeqVar.d;
                if (jfdVar2 != null) {
                    jfdVar2.d();
                }
            }
            jdq jdqVar = jejVar.f;
            if (jdqVar != null) {
                jdqVar.e();
            }
            if (jejVar.g != null) {
                jejVar.f.e();
            }
            jer jerVar = jejVar.d;
            jfe jfeVar = jerVar.g;
            if (jfeVar != null) {
                jfeVar.d();
            }
            jfd jfdVar3 = jerVar.h;
            if (jfdVar3 != null) {
                jfdVar3.d();
            }
            jdv jdvVar = jerVar.e;
            if (jdvVar != null) {
                jdvVar.e();
            }
            jdv jdvVar2 = jerVar.f;
            if (jdvVar2 != null) {
                jdvVar2.e();
            }
            jemVar.b();
            jxaVar.r = null;
            this.a.e(null);
        }
    }
}
