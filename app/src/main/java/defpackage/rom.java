package defpackage;

import android.util.StateSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rom {
    final int a;
    public final roc b;
    final int[][] c;
    final roc[] d;

    public rom(tfm tfmVar) {
        this.a = tfmVar.a;
        this.b = (roc) tfmVar.b;
        this.c = (int[][]) tfmVar.d;
        this.d = (roc[]) tfmVar.c;
    }

    public final int a(int[] iArr) {
        for (int i = 0; i < this.a; i++) {
            if (StateSet.stateSetMatches(this.c[i], iArr)) {
                return i;
            }
        }
        return -1;
    }
}
