package defpackage;

import android.view.MotionEvent;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bpp {
    public final List a;
    public final int b;
    public final int c;
    public int d;
    private final ebn e;

    public bpp(List list) {
        this(list, null);
    }

    public final MotionEvent a() {
        ebn ebnVar = this.e;
        if (ebnVar != null) {
            return (MotionEvent) ((cpq) ebnVar.a).b;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public bpp(java.util.List r7, defpackage.ebn r8) {
        /*
            r6 = this;
            r6.<init>()
            r6.a = r7
            r6.e = r8
            android.view.MotionEvent r8 = r6.a()
            r0 = 0
            if (r8 == 0) goto L13
            int r8 = r8.getClassification()
            goto L14
        L13:
            r8 = r0
        L14:
            r6.b = r8
            android.view.MotionEvent r8 = r6.a()
            if (r8 == 0) goto L21
            int r8 = r8.getButtonState()
            goto L22
        L21:
            r8 = r0
        L22:
            r6.c = r8
            android.view.MotionEvent r8 = r6.a()
            if (r8 == 0) goto L2d
            r8.getMetaState()
        L2d:
            android.view.MotionEvent r8 = r6.a()
            r1 = 3
            r2 = 2
            r3 = 1
            if (r8 == 0) goto L50
            int r7 = r8.getActionMasked()
            if (r7 == 0) goto L4e
            if (r7 == r3) goto L4c
            if (r7 == r2) goto L4a
            switch(r7) {
                case 5: goto L4e;
                case 6: goto L4c;
                case 7: goto L4a;
                case 8: goto L48;
                case 9: goto L46;
                case 10: goto L44;
                default: goto L43;
            }
        L43:
            goto L6d
        L44:
            r0 = 5
            goto L6d
        L46:
            r0 = 4
            goto L6d
        L48:
            r0 = 6
            goto L6d
        L4a:
            r0 = r1
            goto L6d
        L4c:
            r0 = r2
            goto L6d
        L4e:
            r0 = r3
            goto L6d
        L50:
            int r8 = r7.size()
        L54:
            if (r0 >= r8) goto L4a
            java.lang.Object r4 = r7.get(r0)
            bpv r4 = (defpackage.bpv) r4
            boolean r5 = defpackage.akg.A(r4)
            if (r5 == 0) goto L63
            goto L4c
        L63:
            boolean r4 = defpackage.akg.y(r4)
            if (r4 == 0) goto L6a
            goto L4e
        L6a:
            int r0 = r0 + 1
            goto L54
        L6d:
            r6.d = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bpp.<init>(java.util.List, ebn):void");
    }
}
