package defpackage;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qwu {
    public static final Map a = new yd();
    public static final String[] b = {"key", "value"};
    public final ContentResolver c;
    public final Uri d;
    public volatile Map f;
    private final ContentObserver g;
    public final Object e = new Object();
    private final List h = new ArrayList();

    private qwu(ContentResolver contentResolver, Uri uri) {
        contentResolver.getClass();
        uri.getClass();
        this.c = contentResolver;
        this.d = uri;
        this.g = new qwt(this);
    }

    static synchronized void a() {
        Map map = a;
        for (qwu qwuVar : map.values()) {
            qwuVar.c.unregisterContentObserver(qwuVar.g);
        }
        map.clear();
    }

    public static qwu c(ContentResolver contentResolver, Uri uri) {
        qwu qwuVar;
        synchronized (qwu.class) {
            Map map = a;
            qwuVar = (qwu) map.get(uri);
            if (qwuVar == null) {
                try {
                    qwu qwuVar2 = new qwu(contentResolver, uri);
                    try {
                        contentResolver.registerContentObserver(uri, false, qwuVar2.g);
                        map.put(uri, qwuVar2);
                    } catch (SecurityException unused) {
                    }
                    qwuVar = qwuVar2;
                } catch (SecurityException unused2) {
                }
            }
        }
        return qwuVar;
    }

    public final void b() {
        synchronized (this.e) {
            this.f = null;
            qxt.e();
        }
        synchronized (this) {
            Iterator it = this.h.iterator();
            while (it.hasNext()) {
                ((qwv) it.next()).a();
            }
        }
    }
}
