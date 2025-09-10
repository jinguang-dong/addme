package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class em {
    final int a;
    int b;
    int c;
    int d;
    ViewGroup e;
    View f;
    View g;
    public gb h;
    fx i;
    Context j;
    boolean k;
    boolean l;
    boolean m;
    boolean n = false;
    boolean o;
    Bundle p;

    public em(int i) {
        this.a = i;
    }

    final void a(gb gbVar) {
        fx fxVar;
        gb gbVar2 = this.h;
        if (gbVar == gbVar2) {
            return;
        }
        if (gbVar2 != null) {
            gbVar2.m(this.i);
        }
        this.h = gbVar;
        if (gbVar == null || (fxVar = this.i) == null) {
            return;
        }
        gbVar.g(fxVar);
    }
}
