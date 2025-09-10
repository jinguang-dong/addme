package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Parcel;
import android.os.Process;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.google.lens.sdk.LensApi;
import com.google.vr.vrcore.controller.api.ControllerServiceBridge;
import j$.time.Duration;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class smv implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ smv(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [j$.util.stream.BaseStream, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, syu] */
    /* JADX WARN: Type inference failed for: r0v27, types: [com.google.vr.vrcore.controller.api.ControllerServiceBridge$Callbacks, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v28, types: [android.content.ServiceConnection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v32, types: [com.google.vr.vrcore.controller.api.ControllerServiceBridge$Callbacks, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [com.google.vr.vrcore.controller.api.ControllerServiceBridge$Callbacks, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() throws NumberFormatException, IOException {
        boolean z;
        Map allHeaders;
        String str;
        int i;
        long j;
        long j2;
        long j3;
        int i2 = 1;
        switch (this.b) {
            case 0:
                this.a.close();
                return;
            case 1:
                Object obj = this.a;
                try {
                    InputStream inputStream = ((ruq) obj).c;
                    try {
                        byte[] bArr = new byte[400];
                        for (boolean z2 = false; ((ruq) obj).c() && !z2; z2 = z) {
                            int i3 = 0;
                            while (true) {
                                if (i3 >= 400) {
                                    z = false;
                                } else {
                                    int i4 = inputStream.read(bArr, i3, 400 - i3);
                                    if (i4 < 0) {
                                        z = true;
                                    } else {
                                        i3 += i4;
                                    }
                                }
                            }
                            if (((ruq) obj).c() && i3 > 0) {
                                ((rul) ((ruq) obj).e.a).a(ByteBuffer.wrap(bArr, 0, i3));
                            }
                        }
                        ((ruq) obj).a(null);
                        inputStream.close();
                        return;
                    } finally {
                    }
                } catch (IOException e) {
                    ((ruq) obj).a(e);
                    return;
                }
            case 2:
                this.a.cancel(false);
                return;
            case 3:
                int i5 = taq.b;
                this.a.isCancelled();
                return;
            case 4:
                LensApi.d((Activity) this.a);
                return;
            case 5:
                LensApi.d((Activity) this.a);
                return;
            case 6:
                ((ControllerServiceBridge) this.a).a();
                return;
            case 7:
                ControllerServiceBridge.d();
                ControllerServiceBridge controllerServiceBridge = (ControllerServiceBridge) this.a;
                tyr tyrVar = controllerServiceBridge.g;
                if (tyrVar != null) {
                    try {
                        Parcel parcelZ = tyrVar.z(10, tyrVar.a());
                        int i6 = parcelZ.readInt();
                        parcelZ.recycle();
                        if (i6 > 0) {
                            if (controllerServiceBridge.f) {
                                controllerServiceBridge.b();
                                return;
                            }
                            return;
                        }
                    } catch (RemoteException e2) {
                        Log.w("VrCtl.ServiceBridge", "Remote exception while getting number of controllers: ".concat(e2.toString()));
                    }
                }
                SparseArray sparseArray = controllerServiceBridge.d;
                int size = sparseArray.size();
                for (int i7 = 0; i7 < size; i7++) {
                    tym tymVar = (tym) sparseArray.valueAt(i7);
                    if (tymVar != null) {
                        tymVar.b.d(i7, 0);
                    }
                }
                ControllerServiceBridge.d();
                sparseArray.clear();
                controllerServiceBridge.e.b.e();
                return;
            case 8:
                ControllerServiceBridge.d();
                ?? r0 = this.a;
                ControllerServiceBridge controllerServiceBridge2 = (ControllerServiceBridge) r0;
                if (controllerServiceBridge2.f) {
                    Log.w("VrCtl.ServiceBridge", "Service is already bound.");
                    return;
                }
                Intent intent = new Intent("com.google.vr.vrcore.controller.BIND");
                intent.setPackage("com.google.vr.vrcore");
                if (!controllerServiceBridge2.a.bindService(intent, (ServiceConnection) r0, 1)) {
                    Log.w("VrCtl.ServiceBridge", "Bind failed. Service is not available.");
                    controllerServiceBridge2.e.b.h();
                }
                controllerServiceBridge2.f = true;
                return;
            case 9:
                ((vct) this.a).g++;
                return;
            case 10:
                vda vdaVar = (vda) this.a;
                vct vctVar = vdaVar.y;
                if (vctVar != null) {
                    try {
                        vctVar.e();
                    } catch (IOException e3) {
                        Log.e(vda.a, "Exception when closing OutputChannel", e3);
                    }
                }
                HttpURLConnection httpURLConnection = vdaVar.q;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                    vdaVar.q = null;
                    return;
                }
                return;
            case 11:
                vda vdaVar2 = (vda) this.a;
                vdaVar2.f.add(vdaVar2.m);
                vdaVar2.h();
                return;
            case 12:
                vda vdaVar3 = (vda) this.a;
                ReadableByteChannel readableByteChannel = vdaVar3.n;
                if (readableByteChannel != null) {
                    try {
                        readableByteChannel.close();
                    } catch (IOException e4) {
                        e4.printStackTrace();
                    }
                    vdaVar3.n = null;
                    return;
                }
                return;
            case 13:
                ((vda) this.a).w++;
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                vda vdaVar4 = (vda) this.a;
                vdaVar4.m = vdaVar4.p;
                vdaVar4.p = null;
                vdaVar4.h();
                return;
            case 15:
                Object obj2 = this.a;
                try {
                    vda vdaVar5 = ((vcy) obj2).d;
                    vcg vcgVar = vdaVar5.t;
                    long j4 = vdaVar5.s;
                    vdi vdiVar = vdaVar5.o;
                    if (vdiVar != null) {
                        allHeaders = vdiVar.getAllHeaders();
                        vdi vdiVar2 = vdaVar5.o;
                        str = vdiVar2.b;
                        i = vdiVar2.a;
                    } else {
                        allHeaders = Collections.EMPTY_MAP;
                        str = "";
                        i = 0;
                    }
                    String str2 = str;
                    long j5 = 0;
                    long length = 0;
                    for (Map.Entry entry : vdaVar5.e.entrySet()) {
                        if (((String) entry.getKey()) != null) {
                            length += r14.length();
                        }
                        if (((String) entry.getValue()) != null) {
                            length += r9.length();
                        }
                    }
                    if (allHeaders == null) {
                        j = 0;
                    } else {
                        long length2 = 0;
                        for (Map.Entry entry2 : allHeaders.entrySet()) {
                            if (((String) entry2.getKey()) != null) {
                                j2 = j5;
                                length2 += r17.length();
                            } else {
                                j2 = j5;
                            }
                            if (entry2.getValue() != null) {
                                Iterator it = ((List) entry2.getValue()).iterator();
                                while (it.hasNext()) {
                                    if (((String) it.next()) != null) {
                                        length2 += r12.length();
                                    }
                                }
                            }
                            j5 = j2;
                        }
                        j = j5;
                        j5 = length2;
                    }
                    if (allHeaders.containsKey("Content-Length")) {
                        try {
                            j3 = Long.parseLong((String) ((List) allHeaders.get("Content-Length")).get(0));
                        } catch (NumberFormatException unused) {
                            j3 = j;
                        }
                    } else {
                        j3 = -1;
                    }
                    long j6 = j3;
                    Duration durationOfSeconds = Duration.ofSeconds(j);
                    Duration durationOfSeconds2 = Duration.ofSeconds(j);
                    vda vdaVar6 = ((vcy) obj2).d;
                    int i8 = vdaVar6.g.get();
                    if (i8 == 6) {
                        i2 = 2;
                    } else if (i8 != 7) {
                        if (i8 != 8) {
                            throw new IllegalStateException(a.bE(i8, "Internal Cronet error: attempted to report metrics but current state (", ") is not a done state!"));
                        }
                        i2 = 3;
                    }
                    int i9 = i2;
                    int i10 = vdaVar6.w;
                    int i11 = vdaVar6.v;
                    vct vctVar2 = vdaVar6.y;
                    vcgVar.d(j4, new vce(length, j5, j6, i, durationOfSeconds, durationOfSeconds2, str2, i9, i10, i11, vctVar2 != null ? vctVar2.g : 0, vdaVar6.x, Process.myUid(), vcd.CRONET_SOURCE_FALLBACK));
                    return;
                } catch (RuntimeException unused2) {
                    String str3 = vda.a;
                    return;
                }
            default:
                ((vcz) this.a).a();
                return;
        }
    }

    public smv(vda vdaVar, int i, int[] iArr) {
        this.b = i;
        this.a = vdaVar;
    }
}
