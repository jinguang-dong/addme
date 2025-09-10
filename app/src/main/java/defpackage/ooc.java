package defpackage;

import android.os.HandlerThread;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.aXYS.zflNUOOzDfM;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ooc implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ooc(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    public ooc(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, ook] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object, pau] */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.b) {
            case 0:
                Object obj = this.a;
                synchronized (((ooe) obj).b) {
                    if (((ooe) obj).b()) {
                        nwj nwjVar = ooe.p;
                        nwj.s("%s ** IS FORCE-RELEASED ON TIMEOUT **", ((ooe) obj).j);
                        ((ooe) obj).a();
                        if (((ooe) obj).b()) {
                            ((ooe) obj).d = 1;
                            ((ooe) obj).d();
                            return;
                        }
                        return;
                    }
                    return;
                }
            case 1:
                ((ogu) this.a).f.b(new odj(4));
                return;
            case 2:
                Object obj2 = this.a;
                synchronized (((ool) obj2).a) {
                    ((ool) obj2).b.b();
                }
                return;
            case 3:
                Object obj3 = this.a;
                oqb oqbVar = new oqb(((osz) obj3).b, 0);
                try {
                    String str = ((osz) obj3).a;
                    oqbVar.fi();
                    return;
                } finally {
                }
            case 4:
                new oqb((DataHolder) this.a, 1, null).fi();
                return;
            case 5:
                ((HandlerThread) this.a).quitSafely();
                return;
            case 6:
                throw ((Throwable) this.a);
            case 7:
                throw new ova(((ExecutionException) this.a).getCause());
            case 8:
                throw new ova((Throwable) this.a);
            case 9:
                Object obj4 = this.a;
                synchronized (((ovj) obj4).c) {
                    Runnable runnable = ((ovj) obj4).d;
                    if (runnable == null) {
                        return;
                    }
                    ((ovj) obj4).d = null;
                    runnable.run();
                    return;
                }
            case 10:
                throw new RuntimeException((Throwable) this.a);
            case 11:
                this.a.a(Collections.EMPTY_LIST);
                return;
            case 12:
                ((oys) this.a).D.quitSafely();
                return;
            case 13:
                Object obj5 = this.a;
                oys oysVar = (oys) obj5;
                syw sywVar = oysVar.c;
                sywVar.shutdown();
                syw sywVar2 = oysVar.b;
                sywVar2.shutdown();
                syw sywVar3 = oysVar.a;
                sywVar3.shutdown();
                syw sywVar4 = oysVar.d;
                sywVar4.shutdown();
                try {
                    sywVar.awaitTermination(1000L, TimeUnit.MILLISECONDS);
                    sywVar2.awaitTermination(1000L, TimeUnit.MILLISECONDS);
                    sywVar3.awaitTermination(1000L, TimeUnit.MILLISECONDS);
                    sywVar4.awaitTermination(1000L, TimeUnit.MILLISECONDS);
                } catch (InterruptedException e) {
                    Log.e("AudioEncoder", zflNUOOzDfM.gVvXdaeQRB, e);
                }
                try {
                    ((oys) obj5).h.stop();
                    return;
                } catch (RuntimeException e2) {
                    Log.w("AudioEncoder", "MediaCodec could not stop.", e2);
                    return;
                }
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ((oyp) this.a).a.E.e(null);
                return;
            case 15:
                Object obj6 = this.a;
                oyx oyxVar = (oyx) obj6;
                if (oyxVar.f) {
                    return;
                }
                long j = 0;
                if (oyxVar.g > 0) {
                    return;
                }
                Object obj7 = oyxVar.c;
                synchronized (obj7) {
                    long micros = TimeUnit.MILLISECONDS.toMicros(SystemClock.uptimeMillis());
                    Map map = ((oyx) obj6).a;
                    sbv sbvVarM = sbv.m(map);
                    for (oym oymVar : sbvVarM.keySet()) {
                        if (((Boolean) sbvVarM.get(oymVar)).booleanValue()) {
                            synchronized (obj7) {
                                if (map.containsKey(oymVar)) {
                                    if (((Boolean) map.get(oymVar)).booleanValue()) {
                                        AtomicLong atomicLong = (AtomicLong) ((oyx) obj6).b.get(oymVar);
                                        atomicLong.getClass();
                                        if (atomicLong.get() == j) {
                                            break;
                                        } else {
                                            long j2 = (micros - ((oyx) obj6).h) - atomicLong.get();
                                            if (j2 > 3000000) {
                                                Log.e(((oyx) obj6).d, String.format("Track %s is very delayed: %s us", oymVar, Long.valueOf(j2)));
                                                ((oyx) obj6).a(oyx.h(oymVar, 2));
                                                break;
                                            }
                                        }
                                    } else {
                                        break;
                                    }
                                }
                            }
                        } else {
                            synchronized (obj7) {
                                if (!map.containsKey(oymVar)) {
                                    break;
                                } else if (((Boolean) map.get(oymVar)).booleanValue()) {
                                    break;
                                } else {
                                    long j3 = (micros - ((oyx) obj6).h) - ((oyx) obj6).i;
                                    oym oymVar2 = oym.AUDIO;
                                    if (oymVar == oymVar2) {
                                        if (j3 > 1000000) {
                                            Log.e(((oyx) obj6).d, String.format("Audio track not started after %s us", Long.valueOf(j3)));
                                            ((oyx) obj6).a(oyx.h(oymVar2, 1));
                                            break;
                                        }
                                    } else if (j3 > 3000000) {
                                        Log.e(((oyx) obj6).d, String.format("%s track not started after %s us", oymVar, Long.valueOf(j3)));
                                        ((oyx) obj6).a(oyx.h(oymVar, 1));
                                        break;
                                    }
                                    j = 0;
                                }
                            }
                        }
                    }
                    return;
                }
                break;
            case 16:
                Iterator it = DesugarCollections.unmodifiableCollection(((oza) this.a).a).iterator();
                while (it.hasNext()) {
                    ((oyk) it.next()).g();
                }
                return;
            case 17:
                oza ozaVar = (oza) this.a;
                if (ozaVar.b) {
                    return;
                }
                Iterator it2 = DesugarCollections.unmodifiableCollection(ozaVar.a).iterator();
                while (it2.hasNext()) {
                    ((oyk) it2.next()).f();
                }
                ozaVar.b = true;
                return;
            case 18:
                oza ozaVar2 = (oza) this.a;
                if (ozaVar2.b) {
                    return;
                }
                Iterator it3 = DesugarCollections.unmodifiableCollection(ozaVar2.a).iterator();
                while (it3.hasNext()) {
                    ((oyk) it3.next()).f();
                }
                ozaVar2.b = true;
                return;
            case 19:
                oza ozaVar3 = (oza) this.a;
                if (ozaVar3.c) {
                    return;
                }
                Iterator it4 = DesugarCollections.unmodifiableCollection(ozaVar3.a).iterator();
                while (it4.hasNext()) {
                    ((oyk) it4.next()).d();
                }
                ozaVar3.c = true;
                return;
            default:
                Iterator it5 = DesugarCollections.unmodifiableCollection(((oza) this.a).a).iterator();
                while (it5.hasNext()) {
                    ((oyk) it5.next()).e();
                }
                return;
        }
    }
}
