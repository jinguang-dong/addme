package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.provider.Settings;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class clq implements Handler.Callback, ServiceConnection {
    public final Handler a;
    private final Context b;
    private final HandlerThread c;
    private final Map d = new HashMap();
    private Set e = new HashSet();

    public clq(Context context) {
        this.b = context;
        HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
        this.c = handlerThread;
        handlerThread.start();
        this.a = new Handler(handlerThread.getLooper(), this);
    }

    private final void a(clp clpVar) {
        if (clpVar.b) {
            this.b.unbindService(this);
            clpVar.b = false;
        }
        clpVar.e = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void b(defpackage.clp r10) {
        /*
            r9 = this;
            java.util.ArrayDeque r0 = r10.c
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto La
            goto La9
        La:
            boolean r1 = r10.b
            java.lang.String r2 = "NotifManCompat"
            r3 = 0
            if (r1 == 0) goto L12
            goto L45
        L12:
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r4 = "android.support.BIND_NOTIFICATION_SIDE_CHANNEL"
            r1.<init>(r4)
            android.content.ComponentName r4 = r10.a
            android.content.Intent r1 = r1.setComponent(r4)
            android.content.Context r5 = r9.b
            r6 = 33
            boolean r1 = r5.bindService(r1, r9, r6)
            r10.b = r1
            if (r1 == 0) goto L2e
            r10.d = r3
            goto L41
        L2e:
            java.util.Objects.toString(r4)
            java.lang.String r1 = java.lang.String.valueOf(r4)
            java.lang.String r4 = "Unable to bind to listener "
            java.lang.String r1 = r4.concat(r1)
            android.util.Log.w(r2, r1)
            r5.unbindService(r9)
        L41:
            boolean r1 = r10.b
            if (r1 == 0) goto Laa
        L45:
            da r1 = r10.e
            if (r1 == 0) goto Laa
        L49:
            java.lang.Object r1 = r0.peek()
            clo r1 = (defpackage.clo) r1
            if (r1 != 0) goto L52
            goto L9e
        L52:
            da r4 = r10.e     // Catch: android.os.RemoteException -> L8b android.os.DeadObjectException -> L9e
            android.app.Notification r5 = r1.c     // Catch: android.os.RemoteException -> L8b android.os.DeadObjectException -> L9e
            int r6 = r1.b     // Catch: android.os.RemoteException -> L8b android.os.DeadObjectException -> L9e
            java.lang.String r1 = r1.a     // Catch: android.os.RemoteException -> L8b android.os.DeadObjectException -> L9e
            java.lang.String r7 = "android.support.v4.app.INotificationSideChannel"
            android.os.Parcel r8 = android.os.Parcel.obtain()     // Catch: android.os.RemoteException -> L8b android.os.DeadObjectException -> L9e
            r8.writeInterfaceToken(r7)     // Catch: java.lang.Throwable -> L86
            r8.writeString(r1)     // Catch: java.lang.Throwable -> L86
            r8.writeInt(r6)     // Catch: java.lang.Throwable -> L86
            r1 = 0
            r8.writeString(r1)     // Catch: java.lang.Throwable -> L86
            r6 = 1
            if (r5 == 0) goto L77
            r8.writeInt(r6)     // Catch: java.lang.Throwable -> L86
            r5.writeToParcel(r8, r3)     // Catch: java.lang.Throwable -> L86
            goto L7a
        L77:
            r8.writeInt(r3)     // Catch: java.lang.Throwable -> L86
        L7a:
            android.os.IBinder r4 = r4.a     // Catch: java.lang.Throwable -> L86
            r4.transact(r6, r8, r1, r6)     // Catch: java.lang.Throwable -> L86
            r8.recycle()     // Catch: android.os.RemoteException -> L8b android.os.DeadObjectException -> L9e
            r0.remove()     // Catch: android.os.RemoteException -> L8b android.os.DeadObjectException -> L9e
            goto L49
        L86:
            r0 = move-exception
            r8.recycle()     // Catch: android.os.RemoteException -> L8b android.os.DeadObjectException -> L9e
            throw r0     // Catch: android.os.RemoteException -> L8b android.os.DeadObjectException -> L9e
        L8b:
            r0 = move-exception
            android.content.ComponentName r1 = r10.a
            java.util.Objects.toString(r1)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r3 = "RemoteException communicating with "
            java.lang.String r1 = r3.concat(r1)
            android.util.Log.w(r2, r1, r0)
        L9e:
            java.util.ArrayDeque r0 = r10.c
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto La9
            r9.c(r10)
        La9:
            return
        Laa:
            r9.c(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clq.b(clp):void");
    }

    private final void c(clp clpVar) {
        ComponentName componentName = clpVar.a;
        Handler handler = this.a;
        if (handler.hasMessages(3, componentName)) {
            return;
        }
        int i = clpVar.d + 1;
        clpVar.d = i;
        if (i <= 6) {
            handler.sendMessageDelayed(handler.obtainMessage(3, componentName), (1 << r2) * 1000);
            return;
        }
        StringBuilder sb = new StringBuilder("Giving up on delivering ");
        ArrayDeque arrayDeque = clpVar.c;
        sb.append(arrayDeque.size());
        sb.append(" tasks to ");
        sb.append(componentName);
        sb.append(" after ");
        sb.append(clpVar.d);
        sb.append(" retries");
        Log.w("NotifManCompat", sb.toString());
        arrayDeque.clear();
    }

    /* JADX WARN: Type inference failed for: r10v5, types: [android.os.IBinder, java.lang.Object] */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        Set set;
        da daVar;
        int i = message.what;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    clp clpVar = (clp) this.d.get((ComponentName) message.obj);
                    if (clpVar != null) {
                        a(clpVar);
                    }
                    return true;
                }
                if (i != 3) {
                    return false;
                }
                clp clpVar2 = (clp) this.d.get((ComponentName) message.obj);
                if (clpVar2 != null) {
                    b(clpVar2);
                }
                return true;
            }
            ebn ebnVar = (ebn) message.obj;
            Object obj = ebnVar.a;
            ?? r10 = ebnVar.b;
            clp clpVar3 = (clp) this.d.get(obj);
            if (clpVar3 != null) {
                if (r10 == 0) {
                    daVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = r10.queryLocalInterface("android.support.v4.app.INotificationSideChannel");
                    daVar = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof da)) ? new da(r10) : (da) iInterfaceQueryLocalInterface;
                }
                clpVar3.e = daVar;
                clpVar3.d = 0;
                b(clpVar3);
            }
            return true;
        }
        clo cloVar = (clo) message.obj;
        Context context = this.b;
        Object obj2 = clr.a;
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (clr.a) {
            if (string != null) {
                if (!string.equals(clr.b)) {
                    String[] strArrSplit = string.split(":", -1);
                    HashSet hashSet = new HashSet(strArrSplit.length);
                    for (String str : strArrSplit) {
                        ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
                        if (componentNameUnflattenFromString != null) {
                            hashSet.add(componentNameUnflattenFromString.getPackageName());
                        }
                    }
                    clr.c = hashSet;
                    clr.b = string;
                }
                set = clr.c;
            } else {
                set = clr.c;
            }
        }
        if (!set.equals(this.e)) {
            this.e = set;
            List<ResolveInfo> listQueryIntentServices = this.b.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
            HashSet<ComponentName> hashSet2 = new HashSet();
            for (ResolveInfo resolveInfo : listQueryIntentServices) {
                if (set.contains(resolveInfo.serviceInfo.packageName)) {
                    ComponentName componentName = new ComponentName(resolveInfo.serviceInfo.packageName, resolveInfo.serviceInfo.name);
                    if (resolveInfo.serviceInfo.permission != null) {
                        Log.w("NotifManCompat", a.bz(componentName, "Permission present on component ", ", not adding listener record."));
                    } else {
                        hashSet2.add(componentName);
                    }
                }
            }
            for (ComponentName componentName2 : hashSet2) {
                Map map = this.d;
                if (!map.containsKey(componentName2)) {
                    map.put(componentName2, new clp(componentName2));
                }
            }
            Iterator it = this.d.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (!hashSet2.contains(entry.getKey())) {
                    a((clp) entry.getValue());
                    it.remove();
                }
            }
        }
        for (clp clpVar4 : this.d.values()) {
            clpVar4.c.add(cloVar);
            b(clpVar4);
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.a.obtainMessage(1, new ebn(componentName, iBinder, (byte[]) null)).sendToTarget();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.a.obtainMessage(2, componentName).sendToTarget();
    }
}
