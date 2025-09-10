package defpackage;

import android.net.Network;
import android.net.http.HttpEngine;
import android.net.http.UrlRequest;
import android.util.Log;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandlerFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.ExperimentalBidirectionalStream;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vbh extends vbw {
    private static boolean d;
    private static boolean e;
    public final HttpEngine a;
    public final int b;
    public Thread c;
    private final Map f = DesugarCollections.synchronizedMap(new HashMap());

    public vbh(HttpEngine httpEngine, int i) {
        this.a = httpEngine;
        this.b = i;
    }

    private final Executor c(Executor executor) {
        return this.b == Integer.MIN_VALUE ? executor : new vbg(this, executor);
    }

    private static final Network d(long j) {
        if (j == -1) {
            return null;
        }
        return Network.fromNetworkHandle(j);
    }

    final void a(RequestFinishedInfo requestFinishedInfo, vdk vdkVar) {
        ArrayList arrayList = new ArrayList();
        Map map = this.f;
        synchronized (map) {
            arrayList.addAll(map.values());
        }
        if (vdkVar != null) {
            arrayList.add(vdkVar);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            vdk vdkVar2 = (vdk) arrayList.get(i);
            try {
                vdkVar2.getExecutor().execute(new pev(vdkVar2, requestFinishedInfo, 20, null));
            } catch (RejectedExecutionException e2) {
                Log.e("HttpEngineWrapper", "Exception posting task to executor", e2);
            }
        }
    }

    @Override // org.chromium.net.CronetEngine
    public final void addRequestFinishedListener(RequestFinishedInfo.Listener listener) {
        this.f.put(listener, new vdk(listener));
    }

    @Override // defpackage.vbw
    public final ExperimentalUrlRequest b(String str, UrlRequest.Callback callback, Executor executor, int i, Collection collection, boolean z, boolean z2, boolean z3, int i2, boolean z4, int i3, RequestFinishedInfo.Listener listener, long j, String str2, ArrayList arrayList, UploadDataProvider uploadDataProvider, Executor executor2) {
        vbq vbqVar = new vbq(callback);
        UrlRequest.Builder builderNewUrlRequestBuilder = this.a.newUrlRequestBuilder(str, executor, vbqVar);
        builderNewUrlRequestBuilder.setPriority(i);
        if (z) {
            builderNewUrlRequestBuilder.setCacheDisabled(true);
        }
        if (z2) {
            builderNewUrlRequestBuilder.setDirectExecutorAllowed(true);
        }
        if (z3) {
            builderNewUrlRequestBuilder.setTrafficStatsTag(i2);
        }
        if (z4) {
            builderNewUrlRequestBuilder.setTrafficStatsTag(i3);
        }
        builderNewUrlRequestBuilder.bindToNetwork(d(j));
        builderNewUrlRequestBuilder.setHttpMethod(str2);
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            Map.Entry entry = (Map.Entry) arrayList.get(i4);
            builderNewUrlRequestBuilder.addHeader((String) entry.getKey(), (String) entry.getValue());
        }
        if (uploadDataProvider != null) {
            builderNewUrlRequestBuilder.setUploadDataProvider(new vbm(uploadDataProvider), executor2);
        }
        vbs vbsVar = new vbs(builderNewUrlRequestBuilder.build(), this, str, collection, listener);
        vbqVar.b = vbsVar;
        return vbsVar;
    }

    @Override // org.chromium.net.CronetEngine
    public final void bindToNetwork(long j) {
        this.a.bindToNetwork(d(j));
    }

    @Override // org.chromium.net.CronetEngine
    public final URLStreamHandlerFactory createURLStreamHandlerFactory() {
        return this.a.createUrlStreamHandlerFactory();
    }

    @Override // org.chromium.net.CronetEngine
    public final byte[] getGlobalMetricsDeltas() {
        if (!e) {
            e = true;
        }
        return new byte[0];
    }

    @Override // org.chromium.net.CronetEngine
    public final String getVersionString() {
        return HttpEngine.getVersionString();
    }

    @Override // defpackage.vbw, org.chromium.net.ExperimentalCronetEngine, org.chromium.net.CronetEngine
    public final ExperimentalUrlRequest.Builder newUrlRequestBuilder(String str, UrlRequest.Callback callback, Executor executor) {
        return new vdg(str, callback, c(executor), this);
    }

    @Override // org.chromium.net.CronetEngine
    public final URLConnection openConnection(URL url) {
        return (URLConnection) ujo.o(new vbo(this, url, 1), IOException.class);
    }

    @Override // org.chromium.net.CronetEngine
    public final void removeRequestFinishedListener(RequestFinishedInfo.Listener listener) {
        this.f.remove(listener);
    }

    @Override // org.chromium.net.CronetEngine
    public final void shutdown() {
        this.a.shutdown();
    }

    @Override // org.chromium.net.CronetEngine
    public final void startNetLogToFile(String str, boolean z) {
        if (d) {
            return;
        }
        d = true;
    }

    @Override // defpackage.vbw, org.chromium.net.ExperimentalCronetEngine, org.chromium.net.CronetEngine
    public final ExperimentalBidirectionalStream.Builder newBidirectionalStreamBuilder(String str, BidirectionalStream.Callback callback, Executor executor) {
        return new vbu(str, callback, c(executor), this);
    }

    @Override // org.chromium.net.ExperimentalCronetEngine
    public final URLConnection openConnection(URL url, Proxy proxy) {
        if (proxy.type() != Proxy.Type.DIRECT) {
            throw new UnsupportedOperationException();
        }
        String protocol = url.getProtocol();
        if ("http".equals(protocol) || "https".equals(protocol)) {
            return (URLConnection) ujo.o(new vbo(this, url, 1), IOException.class);
        }
        throw new UnsupportedOperationException("Unexpected protocol:".concat(String.valueOf(protocol)));
    }

    @Override // defpackage.vbw, org.chromium.net.ExperimentalCronetEngine, org.chromium.net.CronetEngine
    public final /* bridge */ /* synthetic */ UrlRequest.Builder newUrlRequestBuilder(String str, UrlRequest.Callback callback, Executor executor) {
        return newUrlRequestBuilder(str, callback, executor);
    }

    @Override // org.chromium.net.CronetEngine
    public final void stopNetLog() {
    }
}
