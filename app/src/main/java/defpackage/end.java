package defpackage;

import android.os.Message;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class end {
    public final Object b = new Object();
    public final Runnable a = new dzd(this, 8, null);

    static void a(Message message) {
        if (message != null && (message.obj instanceof end)) {
            ((end) message.obj).a.run();
        }
    }
}
