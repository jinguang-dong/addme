package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class clm {
    public final Context a;
    CharSequence e;
    CharSequence f;
    public PendingIntent g;
    public int h;
    cln i;
    int j;
    int k;
    boolean l;
    public String n;
    Bundle o;
    public String p;
    public final Notification q;

    @Deprecated
    public final ArrayList r;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    final ArrayList d = new ArrayList();
    public boolean m = false;

    public clm(Context context, String str) {
        Notification notification = new Notification();
        this.q = notification;
        this.a = context;
        this.p = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.h = 0;
        this.r = new ArrayList();
    }

    public static CharSequence c(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        return charSequence.length() > 5120 ? charSequence.subSequence(0, 5120) : charSequence;
    }

    public final Bundle b() {
        if (this.o == null) {
            this.o = new Bundle();
        }
        return this.o;
    }

    public final void d(int i, boolean z) {
        Notification notification = this.q;
        if (z) {
            notification.flags = i | notification.flags;
        } else {
            notification.flags = (~i) & notification.flags;
        }
    }

    public final void e(CharSequence charSequence) {
        this.f = c(charSequence);
    }

    public final void f(CharSequence charSequence) {
        this.e = c(charSequence);
    }

    public final void g(boolean z) {
        d(2, z);
    }

    public final void h(int i, int i2, boolean z) {
        this.j = i;
        this.k = i2;
        this.l = z;
    }

    public final void i(int i) {
        this.q.icon = i;
    }

    public final void j(cln clnVar) {
        if (this.i != clnVar) {
            this.i = clnVar;
            if (clnVar == null || clnVar.b == this) {
                return;
            }
            clnVar.b = this;
            clm clmVar = clnVar.b;
            if (clmVar != null) {
                clmVar.j(clnVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x018b  */
    /* JADX WARN: Type inference failed for: r16v0, types: [android.app.Notification, java.lang.String] */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r1v12, types: [android.app.Notification$Builder] */
    /* JADX WARN: Type inference failed for: r1v8, types: [android.app.Notification$BigTextStyle] */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.app.Notification$Builder] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [android.app.Notification$BubbleMetadata, android.net.Uri, java.lang.CharSequence, java.lang.CharSequence[], java.lang.String, long[]] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.app.Notification a() {
        /*
            Method dump skipped, instructions count: 884
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clm.a():android.app.Notification");
    }
}
