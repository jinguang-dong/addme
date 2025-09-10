package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public final class cyo {
    private static final Object f = new Object();
    private static cyo g;
    public final Context a;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final ArrayList d = new ArrayList();
    public final Handler e;

    private cyo(Context context) {
        this.a = context;
        this.e = new cym(this, context.getMainLooper());
    }

    public static cyo a(Context context) {
        cyo cyoVar;
        synchronized (f) {
            if (g == null) {
                g = new cyo(context.getApplicationContext());
            }
            cyoVar = g;
        }
        return cyoVar;
    }

    public final void b(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        HashMap map = this.b;
        synchronized (map) {
            cyn cynVar = new cyn(intentFilter, broadcastReceiver);
            ArrayList arrayList = (ArrayList) map.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList(1);
                map.put(broadcastReceiver, arrayList);
            }
            arrayList.add(cynVar);
            for (int i = 0; i < intentFilter.countActions(); i++) {
                String action = intentFilter.getAction(i);
                HashMap map2 = this.c;
                ArrayList arrayList2 = (ArrayList) map2.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList(1);
                    map2.put(action, arrayList2);
                }
                arrayList2.add(cynVar);
            }
        }
    }

    public final void c(BroadcastReceiver broadcastReceiver) {
        HashMap map = this.b;
        synchronized (map) {
            ArrayList arrayList = (ArrayList) map.remove(broadcastReceiver);
            if (arrayList == null) {
                return;
            }
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    return;
                }
                cyn cynVar = (cyn) arrayList.get(size);
                cynVar.d = true;
                int i = 0;
                while (true) {
                    IntentFilter intentFilter = cynVar.a;
                    if (i < intentFilter.countActions()) {
                        String action = intentFilter.getAction(i);
                        HashMap map2 = this.c;
                        ArrayList arrayList2 = (ArrayList) map2.get(action);
                        if (arrayList2 != null) {
                            int size2 = arrayList2.size();
                            while (true) {
                                size2--;
                                if (size2 < 0) {
                                    break;
                                }
                                cyn cynVar2 = (cyn) arrayList2.get(size2);
                                if (cynVar2.b == broadcastReceiver) {
                                    cynVar2.d = true;
                                    arrayList2.remove(size2);
                                }
                            }
                            if (arrayList2.size() <= 0) {
                                map2.remove(action);
                            }
                        }
                        i++;
                    }
                }
            }
        }
    }
}
